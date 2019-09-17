package tut.conductor.fox

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.netflix.conductor.client.worker.Worker
import com.netflix.conductor.common.metadata.tasks.Task
import com.netflix.conductor.common.metadata.tasks.TaskResult

class TransferPrepForkTask : Worker {
    override fun getTaskDefName(): String {
        return "transfer_prep_dynamic_fork_task_v1"
    }

    override fun execute(task: Task): TaskResult {
        System.out.printf("Executing %s%n\n", taskDefName)
        System.out.println("SLEEP")
        Thread.sleep(3000)
        val result = TaskResult(task)
        result.status = TaskResult.Status.COMPLETED
        result.outputData["tracer"] = "airflow-trace0001"



        result.outputData["dynamicTasks"] = Gson().fromJson(dynamicTasks, object : TypeToken<List<DynamicTask>>() {}.type)
        result.outputData["dynamicTasksInput"] = Gson().fromJson(dynamicTaskInput, object : TypeToken<Map<String, TransferInfo>>() {}.type)
        System.out.println("DONE")
        return result
    }
}

data class TransferInfo(
    val transfer_priority: Int,
    val tracer: String,
    val asset: Asset
)

data class Asset(
    val assetId: String,
    val locations: List<Location>,
    val startDate: String,
    val startTimeCode: String,
    val title: String
)
data class Location(
    val filename: String,
    val location: String
)

val dynamicTaskInput = """{
  "BP007181": {
    "transfer_priority": 264,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BP007181",
      "title": "FS: MOT (2019):Supe FS: MOT: Su",
      "startDate": "2019-09-16",
      "startTimeCode": "18:59:59.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BP007181.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "BP007181"
        }
      ]
    }
  },
  "P273713C": {
    "transfer_priority": 54,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273713C",
      "title": "RLG 19 EF1 PAR VBRI V3 S1",
      "startDate": "2019-09-16",
      "startTimeCode": "15:30:00.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273713C.mxf"
        }
      ]
    }
  },
  "P273782": {
    "transfer_priority": 4044,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273782",
      "title": "WORLD LONG DRIVECHA Episode 4,",
      "startDate": "2019-09-19",
      "startTimeCode": "09:59:28.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273782.mxf"
        }
      ]
    }
  },
  "P273781": {
    "transfer_priority": 3924,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273781",
      "title": "PGA TOUR CHAMPIONS 2 The Ally Ch",
      "startDate": "2019-09-19",
      "startTimeCode": "07:59:33.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273781.mxf"
        }
      ]
    }
  },
  "P273656C": {
    "transfer_priority": 446,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273656C",
      "title": "AFL 360 2019 Episode 99 Coach S3",
      "startDate": "2019-09-16",
      "startTimeCode": "22:01:35.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273656C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273656C"
        }
      ]
    }
  },
  "FLHD4949": {
    "transfer_priority": 263,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4949",
      "title": "BSK FIBA LEGENDSMIKE KRZYZEWSKI",
      "startDate": "2019-09-16",
      "startTimeCode": "18:59:22.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4949.mxf"
        }
      ]
    }
  },
  "P273721C": {
    "transfer_priority": 452,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273721C",
      "title": "NRL 360 2019 Episode 87 Coach S3",
      "startDate": "2019-09-16",
      "startTimeCode": "22:07:23.23",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273721C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273721C"
        }
      ]
    }
  },
  "FLHD4948": {
    "transfer_priority": 260,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4948",
      "title": "BSK FIBA LEGENDSANDREW GAZE",
      "startDate": "2019-09-16",
      "startTimeCode": "18:55:33.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4948.mxf"
        }
      ]
    }
  },
  "P273830C": {
    "transfer_priority": 84,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273830C",
      "title": "RUN 19 M10 RND06TAS V NOR S1",
      "startDate": "2019-09-16",
      "startTimeCode": "16:00:02.00",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273830C.mxf"
        }
      ]
    }
  },
  "P273785": {
    "transfer_priority": 2964,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273785",
      "title": "EUROPEAN PGA TOUR 20 KLM Open Fi",
      "startDate": "2019-09-18",
      "startTimeCode": "15:59:28.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273785.mxf"
        }
      ]
    }
  },
  "P273652C": {
    "transfer_priority": 234,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273652C",
      "title": "AFL 19 THE BEEPTEST E19 S1",
      "startDate": "2019-09-16",
      "startTimeCode": "18:30:02.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273652C.mxf"
        }
      ]
    }
  },
  "FLHD4946": {
    "transfer_priority": 265,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4946",
      "title": "BSK FIBA LEGENDSTHEO PAPALOUKAS",
      "startDate": "2019-09-16",
      "startTimeCode": "19:01:20.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4946.mxf"
        }
      ]
    }
  },
  "P273783": {
    "transfer_priority": 4164,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273783",
      "title": "SOLHEIM CUP 2019GOL Final Day,",
      "startDate": "2019-09-19",
      "startTimeCode": "11:59:28.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273783.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273783"
        }
      ]
    }
  },
  "P273788": {
    "transfer_priority": 1288,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273788",
      "title": "GLF 19 GOLFING WORLD E176 S1",
      "startDate": "2019-09-17",
      "startTimeCode": "12:04:01.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273788.mxf"
        }
      ]
    }
  },
  "P273717C": {
    "transfer_priority": 268,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273717C",
      "title": "NRL TONIGHT 2019Episode 137, tx",
      "startDate": "2019-09-16",
      "startTimeCode": "19:03:58.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273717C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273717C"
        }
      ]
    }
  },
  "P273648C": {
    "transfer_priority": 637,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273648C",
      "title": "@02 19 SF1 GEE VWCE S3",
      "startDate": "2019-09-17",
      "startTimeCode": "01:13:00.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273648C.mxf"
        }
      ]
    }
  },
  "RIPPLE": {
    "transfer_priority": 961,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "RIPPLE",
      "title": "RIPPLE",
      "startDate": "2019-09-17",
      "startTimeCode": "06:36:54.09",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "RIPPLE.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "RIPPLE"
        }
      ]
    }
  },
  "BP007975": {
    "transfer_priority": 231,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BP007975",
      "title": "FS: NRL (2019):Fina NRL Finals",
      "startDate": "2019-09-16",
      "startTimeCode": "18:26:58.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BP007975.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "BP007975"
        }
      ]
    }
  },
  "BP007976": {
    "transfer_priority": 309,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BP007976",
      "title": "FS: NRL (2019):Fina NRL Finals",
      "startDate": "2019-09-16",
      "startTimeCode": "19:45:21.08",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BP007976.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "BP007976"
        }
      ]
    }
  },
  "P273657C": {
    "transfer_priority": 474,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273657C",
      "title": "AFL ON THE COUCH201 Episode 27,",
      "startDate": "2019-09-16",
      "startTimeCode": "22:30:00.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273657C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273657C"
        }
      ]
    }
  },
  "P273831C": {
    "transfer_priority": 144,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273831C",
      "title": "BSK 19 FIBA WC BRO AUS V FRA  S1",
      "startDate": "2019-09-16",
      "startTimeCode": "17:00:03.00",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273831C.mxf"
        }
      ]
    }
  },
  "P273722C": {
    "transfer_priority": 489,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273722C",
      "title": "CONTROVERSY CORNER 2 Episode 26,",
      "startDate": "2019-09-16",
      "startTimeCode": "22:44:58.24",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273722C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273722C"
        }
      ]
    }
  },
  "P273710C": {
    "transfer_priority": 3841,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273710C",
      "title": "NRL WOMENS PREMIERSH Round 1 Dra",
      "startDate": "2019-09-19",
      "startTimeCode": "06:37:13.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273710C.mxf"
        }
      ]
    }
  },
  "P273786C": {
    "transfer_priority": 3054,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273786C",
      "title": "WORLD LONG DRIVECHA Episode 4,",
      "startDate": "2019-09-18",
      "startTimeCode": "17:29:28.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273786C.mxf"
        }
      ]
    }
  },
  "P273653C": {
    "transfer_priority": 267,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273653C",
      "title": "AFL TONIGHT 2019Episode 113, tx",
      "startDate": "2019-09-16",
      "startTimeCode": "19:03:01.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273653C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273653C"
        }
      ]
    }
  },
  "FLHD4517": {
    "transfer_priority": 128,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4517",
      "title": "RUN 7S WOM AUS VUSA",
      "startDate": "2019-09-16",
      "startTimeCode": "16:43:54.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4517.mxf"
        }
      ]
    }
  },
  "FLHD4957": {
    "transfer_priority": 285,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4957",
      "title": "BSK 2019 FIBA WCPMILLS HLF TIME",
      "startDate": "2019-09-16",
      "startTimeCode": "19:21:19.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4957.mxf"
        }
      ]
    }
  },
  "FLHD4516": {
    "transfer_priority": 136,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4516",
      "title": "RUN WORLD CUP 7S18 MEN AUSVCAN",
      "startDate": "2019-09-16",
      "startTimeCode": "16:52:21.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4516.mxf"
        }
      ]
    }
  },
  "BM000380": {
    "transfer_priority": 256,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BM000380",
      "title": "CRI WBBL 2018/19OPENER",
      "startDate": "2019-09-16",
      "startTimeCode": "18:51:36.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BM000380.mxf"
        }
      ]
    }
  },
  "FLHD4515": {
    "transfer_priority": 146,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4515",
      "title": "RUN WORLD CUP7S18 MEN AUSVRUS",
      "startDate": "2019-09-16",
      "startTimeCode": "17:01:49.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4515.mxf"
        }
      ]
    }
  },
  "FLHD4952": {
    "transfer_priority": 262,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4952",
      "title": "BSK FIBA LEGENDSALONZO MOURNING",
      "startDate": "2019-09-16",
      "startTimeCode": "18:57:24.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4952.mxf"
        }
      ]
    }
  },
  "P273706C": {
    "transfer_priority": 114,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273706C",
      "title": "@01 LEAGUE WRAPE27 S1",
      "startDate": "2019-09-16",
      "startTimeCode": "16:30:03.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273706C.mxf"
        }
      ]
    }
  },
  "FLHD4951": {
    "transfer_priority": 269,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4951",
      "title": "BSK FIBA LEGENDSPAU GASOL",
      "startDate": "2019-09-16",
      "startTimeCode": "19:05:17.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4951.mxf"
        }
      ]
    }
  },
  "FLHD4950": {
    "transfer_priority": 267,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4950",
      "title": "BSK FIBA LEGENDSTONY KUKOC",
      "startDate": "2019-09-16",
      "startTimeCode": "19:03:18.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4950.mxf"
        }
      ]
    }
  },
  "P273827C": {
    "transfer_priority": 324,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273827C",
      "title": "RUN 19 M10 RND06SOU V MAN S1",
      "startDate": "2019-09-16",
      "startTimeCode": "20:00:20.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273827C.mxf"
        }
      ]
    }
  },
  "P273738C": {
    "transfer_priority": 834,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273738C",
      "title": "MOT 19 V8SC AUCKLAND RACE24  S1",
      "startDate": "2019-09-17",
      "startTimeCode": "04:30:00.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273738C.mxf"
        }
      ]
    }
  },
  "P273649C": {
    "transfer_priority": 24,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273649C",
      "title": "@01 19 SF2 BRI VGWS S1",
      "startDate": "2019-09-16",
      "startTimeCode": "15:00:12.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273649C.mxf"
        }
      ]
    }
  },
  "BP008012": {
    "transfer_priority": 266,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BP008012",
      "title": "FS: AFL (2019):Fina FS: AFL: Fi",
      "startDate": "2019-09-16",
      "startTimeCode": "19:01:36.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BP008012.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "BP008012"
        }
      ]
    }
  },
  "BP008011": {
    "transfer_priority": 252,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BP008011",
      "title": "FS: AFL (2019):Fina FS: AFL: Fi",
      "startDate": "2019-09-16",
      "startTimeCode": "18:48:16.15",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BP008011.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "BP008011"
        }
      ]
    }
  },
  "P273694C": {
    "transfer_priority": 29,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273694C",
      "title": "@@G 19 EF2 MAN VCRO S2",
      "startDate": "2019-09-16",
      "startTimeCode": "15:04:24.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273694C.mxf"
        }
      ]
    }
  },
  "P273650C": {
    "transfer_priority": 100,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273650C",
      "title": "@02 19 SF2 BRI VGWS S3",
      "startDate": "2019-09-16",
      "startTimeCode": "16:15:53.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273650C.mxf"
        }
      ]
    }
  },
  "P273735C": {
    "transfer_priority": 204,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273735C",
      "title": "@01 19 SUNDAY WITH MJ E26 S1",
      "startDate": "2019-09-16",
      "startTimeCode": "18:00:02.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273735C.mxf"
        }
      ]
    }
  },
  "P273723C": {
    "transfer_priority": 505,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273723C",
      "title": "CONTROVERSY CORNER 2 Episode S2",
      "startDate": "2019-09-16",
      "startTimeCode": "23:00:48.24",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273723C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273723C"
        }
      ]
    }
  },
  "P273832C": {
    "transfer_priority": 204,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273832C",
      "title": "BSK 19 FIBA WC GF ARG V SPAIN S1",
      "startDate": "2019-09-16",
      "startTimeCode": "18:00:01.05",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273832C.mxf"
        }
      ]
    }
  },
  "P273787C": {
    "transfer_priority": 1260,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273787C",
      "title": "SOLHEIM CUP 2019GOL Final Day,",
      "startDate": "2019-09-17",
      "startTimeCode": "11:36:01.10",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273787C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273787C"
        }
      ]
    }
  },
  "P273654C": {
    "transfer_priority": 282,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273654C",
      "title": "AFL TONIGHT 2019Episode 113 S2",
      "startDate": "2019-09-16",
      "startTimeCode": "19:18:01.06",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273654C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273654C"
        }
      ]
    }
  },
  "P273795C": {
    "transfer_priority": 174,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273795C",
      "title": "AFL FIRST CRACKPODCAST E03 S1",
      "startDate": "2019-09-16",
      "startTimeCode": "17:30:10.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273795C.mxf"
        }
      ]
    }
  },
  "P273719C": {
    "transfer_priority": 283,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273719C",
      "title": "NRL TONIGHT 2019Episode 137 D2",
      "startDate": "2019-09-16",
      "startTimeCode": "19:18:28.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273719C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273719C"
        }
      ]
    }
  },
  "P273828C": {
    "transfer_priority": 384,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273828C",
      "title": "RUN 19 M10 RND06MAN V AUC S1",
      "startDate": "2019-09-16",
      "startTimeCode": "21:00:01.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273828C.mxf"
        }
      ]
    }
  },
  "P273707C": {
    "transfer_priority": 158,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273707C",
      "title": "@02 LEAGUE WRAPE27 S3",
      "startDate": "2019-09-16",
      "startTimeCode": "17:13:36.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273707C.mxf"
        }
      ]
    }
  },
  "BM000375": {
    "transfer_priority": 221,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "BM000375",
      "title": "RUN INTERNATIONAL BUMPER",
      "startDate": "2019-09-16",
      "startTimeCode": "18:17:02.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "BM000375.mxf"
        }
      ]
    }
  },
  "FLHD4961": {
    "transfer_priority": 304,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4961",
      "title": "BSK 2019 FIBA WCA BAYNES HLFTIM",
      "startDate": "2019-09-16",
      "startTimeCode": "19:40:20.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4961.mxf"
        }
      ]
    }
  },
  "FLHD4960": {
    "transfer_priority": 298,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "FLHD4960",
      "title": "FIBA WORLD CUP ANDREW BOGUT",
      "startDate": "2019-09-16",
      "startTimeCode": "19:33:56.21",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "FLHD4960.mxf"
        }
      ]
    }
  },
  "P273667C": {
    "transfer_priority": 804,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273667C",
      "title": "MOT 19 V8SC AUCKLAND TTSO S1",
      "startDate": "2019-09-17",
      "startTimeCode": "03:59:48.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273667C.mxf"
        }
      ]
    }
  },
  "P273655C": {
    "transfer_priority": 414,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273655C",
      "title": "AFL 360 2019 Episode 99 Coaches",
      "startDate": "2019-09-16",
      "startTimeCode": "21:30:00.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273655C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273655C"
        }
      ]
    }
  },
  "P273720C": {
    "transfer_priority": 414,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273720C",
      "title": "NRL 360 2019 Episode 87 Coaches",
      "startDate": "2019-09-16",
      "startTimeCode": "21:29:58.22",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273720C.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273720C"
        }
      ]
    }
  },
  "P273764C": {
    "transfer_priority": 924,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273764C",
      "title": "MOT 19 V8SC TRACKSIDE EP10 S1",
      "startDate": "2019-09-17",
      "startTimeCode": "06:00:00.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273764C.mxf"
        }
      ]
    }
  },
  "P273784C": {
    "transfer_priority": 2844,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273784C",
      "title": "USPGA TOUR/FEDEXCUP Military Tr",
      "startDate": "2019-09-18",
      "startTimeCode": "13:59:28.19",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273784C.mxf"
        }
      ]
    }
  },
  "P273829C": {
    "transfer_priority": 24,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273829C",
      "title": "RUN 19 M10 RND06WEL V OTA S1",
      "startDate": "2019-09-16",
      "startTimeCode": "15:00:04.00",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273829C.mxf"
        }
      ]
    }
  },
  "P273716": {
    "transfer_priority": 190,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273716",
      "title": "NRL TRY TIME 2019 Final Week S2",
      "startDate": "2019-09-16",
      "startTimeCode": "17:46:02.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273716.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273716"
        }
      ]
    }
  },
  "P273715": {
    "transfer_priority": 174,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273715",
      "title": "NRL TRY TIME 2019 Final Week 1,",
      "startDate": "2019-09-16",
      "startTimeCode": "17:30:02.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273715.mxf"
        },
        {
          "location": "k2-backup",
          "filename": "P273715"
        }
      ]
    }
  },
  "P273736C": {
    "transfer_priority": 243,
    "tracer": "airflow-trace0001",
    "asset": {
      "assetId": "P273736C",
      "title": "@02 19 SUNDAY WITH MJ E26 S3",
      "startDate": "2019-09-16",
      "startTimeCode": "18:39:15.20",
      "locations": [
        {
          "location": "playout-dr",
          "filename": "P273736C.mxf"
        }
      ]
    }
  }
}""".trim()


val dynamicTasks = """[
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273829C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273649C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273694C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273713C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273830C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273650C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273706C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4517",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4516",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273831C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4515",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273707C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273715",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273795C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273716",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273832C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273735C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BM000375",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BP007975",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273652C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273736C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BP008011",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BM000380",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4948",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4952",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4949",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BP007181",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4946",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BP008012",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273653C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4950",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273717C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4951",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273654C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273719C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4957",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4960",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "FLHD4961",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "BP007976",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273827C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273828C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273720C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273655C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273656C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273721C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273657C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273722C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273723C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273648C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273667C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273738C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273764C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "RIPPLE",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273787C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273788",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273784C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273785",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273786C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273710C",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273781",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273782",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         },
         {
            "name": "transfer_and_wait_task_v1",
            "taskReferenceName": "P273783",
            "type": "SIMPLE",
            "retryCount": 3,
            "timeoutSeconds": 60,
            "timeoutPolicy": "RETRY",
            "retryLogic": "FIXED",
            "retryDelaySeconds": 30,
            "responseTimeoutSeconds": 60,
            "optional": true
         }
      ]""".trim()
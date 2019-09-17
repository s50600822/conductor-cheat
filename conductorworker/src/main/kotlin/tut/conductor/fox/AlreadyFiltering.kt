package tut.conductor.fox

import com.netflix.conductor.client.worker.Worker
import com.netflix.conductor.common.metadata.tasks.Task
import com.netflix.conductor.common.metadata.tasks.TaskResult

class AlreadyFiltering : Worker {
    override fun getTaskDefName(): String {
        return "already_transferring_filter_v1"
    }

    override fun execute(task: Task): TaskResult {
        System.out.printf("Executing %s%n\n", taskDefName)
        System.out.println("SLEEP")
        Thread.sleep(3000)
        val result = TaskResult(task)
        result.status = TaskResult.Status.COMPLETED
        result.outputData["tracer"] = "airflow-trace0001"
        result.outputData["transfer_assets_size"] = 62
        result.outputData["transfer_assets"] =""" [
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
         },
         {
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
      ]"""
        System.out.println("DONE")
        return result
    }
}
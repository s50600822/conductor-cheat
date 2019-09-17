curl -X POST --header 'Content-Type: application/json' 'http://localhost:8080/api/workflow/transfer-asset-workflow' -d'{
    "tracer": "airflow-trace0001",
    "startDate": "2019-09-16T14:35:15+10:00",
    "endDate": "2019-09-19T14:35:15+10:00",
    "locations": [
      {
        "name": "playout-dr"
      },
      {
        "name": "k2-backup"
      }
    ]
  }'
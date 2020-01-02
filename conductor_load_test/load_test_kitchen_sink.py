import requests
import time

payload = {"task2Name": "task_5" }

default_conductor_api = 'conductor-server.web-staging.dev.cluster.foxsports-gitops-prod.com.au/api'
default_kitchensink_count = 20

conductor_api = os.getenv('CONDUCTOR_API', default_conductor_api)
kitchensink_count = os.getenv('WORKFLOW_COUNT', default_kitchensink_count)

for x in range(1, kitchensink_count):
	r = requests.post(
		url='http://{0}/workflow/kitchensink'.format(conductor_api),
		json=payload, 
		headers = {'content-type': 'application/json'}
	)
	print("{} -> {}".format(x, r.text))
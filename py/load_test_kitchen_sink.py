import requests
import time

payload = {"task2Name": "task_5" }

for x in range(1, 30000):
	time.sleep(1)
	r = requests.post(
		url='http://localhost:8080/api/workflow/kitchensink', 
		json=payload, 
		headers = {'content-type': 'application/json'}
	)
	print("{} -> {}".format(x, r.text))

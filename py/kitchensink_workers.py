from __future__ import print_function
from conductor.ConductorWorker import ConductorWorker
import random


def execute(task):
    return {
        'status': 'COMPLETED',
        'output': {'mod': 5, 'taskToExecute': 'task_1', 'oddEven': 0},
        'logs': ['one', 'two']
    }


def execute4(task):
    fork_tasks = [
        {
            "name": "sub_workflow_4",
            "taskReferenceName": "wf_dyn",
            "type": "SUB_WORKFLOW",
            "subWorkflowParam": {"name": "sub_flow_1"}
        }
    ]
    inputs = {}
    inputs["wf_dyn"]={}

    for x in range(1, 30):
        if x == 4:
            pass
        else:
            fork_tasks.append({
                "name": "task_{}".format(x),
                "taskReferenceName": "task_1_{}".format(x), "type": "SIMPLE"
            })
            inputs["task_1_{}".format(x)] = {}

    return {
        'status': 'COMPLETED',
        'output': {
            'mod': 5,
            'taskToExecute': 'task_1',
            'oddEven': 0,
            'dynamicTasks': fork_tasks,
            'inputs': inputs
        },
        'logs': ['one', 'two']
    }


def main():
    print('Starting Kitchensink workflows')
    cc = ConductorWorker('http://localhost:8080/api', 1, 10)
    for x in range(1, 30):
        if x == 4:
            cc.start('task_{0}'.format(x), execute4, False)
        else:
            cc.start('task_{0}'.format(x), execute, False)
    cc.start('task_30', execute, True)


if __name__ == '__main__':
    main()

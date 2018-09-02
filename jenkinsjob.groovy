import groovy.json.JsonSlurper
import java.text.SimpleDateFormat




def default_pipeline_project_branch = 'master'
def jenkins_view_name = 'Redshift Batch ETL Pipelines'

def projects = []
def page = 1
def per_page = 1
def slurper = new JsonSlurper()

def get = slurper.parse(new URL("https://localhost:3000/getAllApps").openConnection());

print get

// Add a new key to each element of the stacks map, holding the data retrieved from Gitlab for said stack.

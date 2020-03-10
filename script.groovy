def buildApp() {
	echo "Building the Application"
}

def testApp() {
	echo "Testing the Application"
}

def deployApp() {
	echo "Deploying the Application v ${params.VERSION}"
}

return this

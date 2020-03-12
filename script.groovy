def buildApp() {
	echo "Starting Application Build with dotnet..."
	echo "Checking out the directory and building the project..."
	'cmd /c dotnet build "C:/Users/Faisal/Dropbox/University/Projects on GitHub/DevOps/DevOps"'.execute().text
	echo "PROCESSED"
}
return this

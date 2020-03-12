def buildApp() {
	echo "Starting Application Build with dotnet."
	echo "Checking out the directory"
	print "cd C:\Users\Faisal\Dropbox\University\Projects on GitHub\DevOps\DevOps".execute().text
	echo "Running dotnet msbuild"
	print "dotnet msbuild DevOps.sln".execute().text
}
return this

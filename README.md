# flintmatch-engine

The FlintMatch Engine is an engine for a matching making service.

For right now, to use this engine, run a maven clean package and then add the resulting jar file
manually to your local maven repo with this command:

mvn install:install-file \
    -Dfile=<path-to-file>\flintmatch-engine-1.0.0.jar \
    -DgroupId=com.flintmatch \
    -DartifactId=flintmatch-engine \
    -Dversion=1.0.0 \
    -Dpackaging=jar
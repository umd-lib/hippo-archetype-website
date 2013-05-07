#!/bin/bash -x

# archetypeVersion
VERSION="$1"
if [ -z "$VERSION" ]; then
  echo "archetypeVersion is required"
  exit 1
fi

# Remove everything except README.md and generate.sh; empty
# directories will be left
git ls-files | grep -v README.md | grep -v generate.sh | xargs rm

# generate from archetype, using defaults
mvn archetype:generate \
-DarchetypeRepository=http://maven.onehippo.com/maven2 \
-DarchetypeGroupId=org.onehippo.cms7 \
-DarchetypeArtifactId=hippo-archetype-website \
-DarchetypeVersion=$VERSION \
-DinteractiveMode=false

# put new files into place
(cd myhippoproject; tar cf - *) | tar xf -
rm -r myhippoproject

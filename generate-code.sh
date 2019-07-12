#!/bin/bash

root_dir=`pwd`
idl_dir=$root_dir/data/idl
java_out=$root_dir/java/src/main/java

echo

echo -e "generating code for fbs IDL\n"
cd $idl_dir/fbs
$root_dir/tools/flatc --java -o $java_out *.fbs

echo -e "generating code for proto IDL\n"
cd $idl_dir/proto
$root_dir/tools/protoc/bin/protoc --java_out=$java_out *.proto

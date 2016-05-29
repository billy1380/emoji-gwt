#!/bin/bash
source=${1}
mkdir ${source}
for i in original/${source}/*.png; do
  convert $i -resize x64 $source/$(basename $i .png).png;
done
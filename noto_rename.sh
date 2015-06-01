#!/bin/bash
find . -name 'emoji*.png' -type f -exec bash -c 'mv "$1" "${1/\/emoji_u//}"' -- {} \;
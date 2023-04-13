#!/bin/bash

# check if the number is even or odd
# to start put: ./myscript 14 or 15

echo $1;
if [[ $1%2 -eq 0 ]];
  then
    echo $1 is even
  else
    echo $1 odd
fi

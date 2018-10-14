# Afterburner benchmark

[![Build Status](https://travis-ci.org/nduheron/benchmark-afterburner.svg?branch=master)](https://travis-ci.org/nduheron/benchmark-afterburner)

## Résultat

### 1 utilisateur appelle le service continuellement pendant 30 secondes

|Benchmark		|  Count	| Average	| 90 percentille	| Unit	|
|:-------		|:------:	|:------:	|:------------:		|:----:	|
|With Afterburner	|1186617		|0,253	|0,324			| ms/op	|
|Without Afterburner |993800		|0,302		|0,412				| ms/op	|


### 20 utilisateurs appellent le service simultanément

|Benchmark		|  Count	| Average	| 90 percentille	| Unit	|
|:-------		|:------:	|:------:	|:------------:		|:----:	|
|With Afterburner	|151713		|1,310	|0,543			| ms/op	|
|Without Afterburner  |124735		| 1,597	|0,908			| ms/op	|

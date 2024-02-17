/*
* recreating the JAVA activity 5 in vlang
*/

import os {input}
// input the name and loop to 10

fn main(){
	name := input("What is your name: ")

	// traditional C style for loop
	println("*** C Style For Loop ***")
	for i:=0; i < 10; i++{
		println(name)
	}

}
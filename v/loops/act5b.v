
import os {input}

fn main(){
	mut row := 0
	mut col_nums := ""
	mut col_lines := ""
	// mut first_row_num = ""
	mut row_num := ""	

	println("============= MULTIPLICATION CALCULATOR =================")
	row_input := input("How many rows and collumn of multiplication table\n[default : 10]:")
	
	// sad no ternary operator :(
	if row_input == "" {row = 10} else {row = row_input.u8()}

	// columns
	for i := 0 ; i < row ; i++{
		col_nums += ("${'':2s}${i:2d}")
	}
	println(col_nums)

	for i := 0 ; i < row ; i++{
		col_lines += "-----"
	}
	println(col_lines)

	// rows
	for i := 1 ; i <= row; i++{
		row_num += "${'':3s}${i:2d}${'':3s}|"
		for j:= 1 ; j <= row; j++{
			row_num += "${'':2s}${i*j:2d}"
		}
		row_num += "\n"
	}
	println(row_num)



}
import os {input}

fn main(){

	mut is_loop := true
	mut is_try := true

	for is_loop{
		is_try = true

		customer_name := input("Please enter customer name: ")
		item_purchase := input("Please enter purchased item: ")

		qty := input("Please enter Quantity: ").u8()
		price := input("Please enter Price: ").f32()
		cash := input("Please enter Cash: ").f32()

		mut total_price := qty * price;

		// get a discout
 		if total_price >= 1000 {
            total_price -= total_price * 0.3 // the total_price := total_price*0.3 causes redefinition error

		println("\nCustomer name : ${customer_name}\nPurchased item : ${item_purchase}\nQuantity : ${qty}\nPrice ${total_price}")
		println("Total bill ${total_price}\nCash ${cash}\nChange: ${cash-total_price}")

		for is_try{
			is_loop_ := input("Do you want to try again? Y/N: ").to_lower()

			if is_loop_ == 'y' || is_loop_ == 'n'{
				is_try = false
				if is_loop_ == 'n'{
					is_loop = false
				}
			}
		}
		}
	}
}
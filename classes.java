
public class customer{
	private string name, email, phone, pass, country, city;
	customer(string name, string email, string phone, string pass, string country, string city){
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.pass = pass;
		this.country = country;
		this.city = city;
	}
	public void edit_customer(){
		
	}
	
}

class admin extends customer{
	public bool accept_store(store str){
	//gets input from user to accept or reject
	
	}
	
	public bool accept_store(store str){
		
	}	
}


public class logg extends customer{
	string user;
	String pass;
	
	bool check_log(string user,string pass){
		bool check = false;
		//read from the DB and check validation of the entered credentials
		//then store them 
		if check{
			return true;
		}
		return false
	}
	
	void add_store(store st){
	//add this accepted store to the database
	//insert into store(owner,sname,stype,sadress) values(@owner,@sname,@stype,@sadress)
	}
	
	void request_store(store st){
	//send the new store data to the admin accoun t in ordr to accept or reject it to add to the data base
	}
}

abstract class store{
	String owner,sname,stype,sadress;
	void add_pr(product pr){
		
	}
}

class product{
	private String Name, Extra;
	private float Hprice,Lprice,price;
	private int Id;
	product(String name, string ex, int id, float hp, float lp, float p){
		this.Name = name;
		this.Extra = ex;
		this.Id = id;
		this.Hprice = hp;
		this.Lprice = lp;
		this.price = p;
	}
}

class brand{
	private String Name;
	brand(string name){
		this.Name = name;
	}
}

class order{
	int number;
	product prs[];
	order(product pr[]){
		this.prs = pr;		
	}
}


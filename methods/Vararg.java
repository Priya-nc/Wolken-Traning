class Vararg{
public static void main(String []args){
	multiValue("I"," ","am"," ","Priya");
	multiValue("I"," ","am"," ","working"," ","in"," ","wolken"," ","software");
	}
	static void multiValue(String ...name)
	{
	    for(String i:name){
		System.out.print(i);
		}
		System.out.println();
		}
		}
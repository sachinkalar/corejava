package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class WithExternalize implements Externalizable{
	public int id = 0;
	public String name = null;
	public String lastname  = null;
	public int salary = 0;
	


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		 out.writeObject(id);
		 out.writeObject(name);
		 out.writeObject(lastname);
		 
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	id	= (int)in.readObject();
	name = (String) in.readObject();
	lastname = (String) in.readObject();
	
	}
			
}

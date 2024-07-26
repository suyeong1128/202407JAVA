package java0725;

public class Key {
	int  number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comparekey = (Key)obj;
			if(this.number == comparekey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
	
}

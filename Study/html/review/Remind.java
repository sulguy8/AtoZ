package review;

public class Remind {
	private String[] strs;
	
	public Remind() {
		this.strs = new String[0];
	}
	
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1] = str;
		for(int i=0; i<tmpStr.length; i++) {
			this.strs[i] = tmpStr[i];
		}
	}
	
	public String toString() {
		String str = "[";
		for(int i=0; i<strs.length; i++) {
			str += strs[i] + ",";
			
		}
		str = str.substring(0,str.length()-1);
		str += "]";
		return str;
	}
	
	public int indexOf(String str) {
		for(int i=0; i<strs.length; i++) {
			if(str.equals(strs[i])) {
				return i;
			}
		}		
		
		return -1;
	}
	
	public void remove(int idx) {
		
		String[] tmp = this.strs;
		strs = new String[strs.length-1];
		for(int i=0; i<idx; i++) {
			strs[i] = tmp[i];
		}
		for(int i=idx+1; i<tmp.length; i++) {
			strs[i-1] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		Remind lt = new Remind();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.remove(1);
		
		System.out.println(lt);
	}
}

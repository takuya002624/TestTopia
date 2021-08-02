package practice15_9;

public class Main01 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		for(String str : a) {
			System.out.println(str);
		}
	}

	public String str(String folder,String file) {

		if(!folder.endsWith("\\")){
			folder +="\\";
		}

		return folder + file;
	}

}

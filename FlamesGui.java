

import javax.swing.*;

public class FlamesGui {
	public static void main(String[] args) {
		
		String NameCrush;
		String NameUser;
		String result;
		int counter = 0;
		int breakIt;
		int signal;
		NameCrush = JOptionPane.showInputDialog("Name of your crush:");
		NameUser = JOptionPane.showInputDialog("Your name:");
		NameCrush = NameCrush.replace(" ", "");
                NameUser = NameUser.replace(" ", "");
                NameCrush = NameCrush.toLowerCase();
                NameUser = NameUser.toLowerCase();
		
		for (int charCrush=0;charCrush<NameCrush.length();charCrush++){
			breakIt = 0;
			signal = 0;
			for(int charMe=0;charMe<NameUser.length();charMe++){
				if(NameCrush.charAt(charCrush)==NameUser.charAt(charMe)){
					counter++;
					for (int charCrush1=0;charCrush1<charCrush;charCrush1++){
						if(NameCrush.charAt(charCrush1)==NameCrush.charAt(charCrush)){
							counter--;
							breakIt=1;
							break;
						}
					}
					if(breakIt==1){
						break;
					}
					if (signal==0){
						for(int charCrush1=0;charCrush1<NameCrush.length();charCrush1++){
							if(NameCrush.charAt(charCrush1)==NameCrush.charAt(charCrush)){
								counter++;
							}
						}
						signal=1;
					}
				}
			}
			
		}
		while(counter>6){
			counter = counter - 6;
		}
		if (counter==1)
			result = "friends";
		else if (counter==2)
			result = "lovers";
		else if (counter==3)
			result = "angry";
		else if (counter==4)
			result = "marriage";
		else if (counter==5)
			result = "enemy";
		else
			result = "sweet";
		JOptionPane.showMessageDialog(null, result, "Flames", JOptionPane.PLAIN_MESSAGE);

	}

}

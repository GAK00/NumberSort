package popups.controller;

import popups.view.PopupViewer;

public class Controller
{
	private PopupViewer display;

	public Controller()
	{
		display = new PopupViewer();
	}

	public void start()
	{
		boolean Go = true;
		while(Go)
		if (display.collectUserOption("Do you want to sort numbers?") == 0){
			
		String rawdata =	display.collectResponse("enter numbers to sort seperated by a coma");
		if(rawdata!=null){
			for(int count = 0;count<rawdata.length();count++){
				if(rawdata.charAt(count) == ','){
					while(count2 !=)
				}
			}
		}
				
			
		}
		
		else{if (display.collectUserOption("Are you sure you wish to leave?") == 0){Go=false;}
		}
	}

}

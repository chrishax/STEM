package GRS.stem;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuView extends Activity {

	//declare form views and other class variables
		Button 	btn1, 
				btn2,
				btn3,
				btn4,
				btn5,
				btn6,
				btnBottom;
				
			//the onCreate method runs when the activity is created
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_menu_view);
		
		    //attach all the view variables to their .xml defined counterpart//////
		    btn1=(Button)findViewById(R.id.button1);
		    btn2=(Button)findViewById(R.id.button2);
		    btn3=(Button)findViewById(R.id.button3);
		    btn4=(Button)findViewById(R.id.button4);
		    btn5=(Button)findViewById(R.id.button5);
		    btn6=(Button)findViewById(R.id.button6);
		    btnBottom=(Button)findViewById(R.id.buttonBottom);
		    
		    
		        
		 }

		
		
		
		    /////////////////////////////////
		   //    Button Click Methods     //
		  /////////////////////////////////
		
		//Click method for the account management button - opens account management activity
		 public void accountClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);  	
		 }
		 
		 //Click method for the create WO button - opens create WO activity
		 public void createClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
			 
		 }  

		 //Click method for the open WO button - opens "open WO" activity
		 public void openClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent); 
		 }
		    
		 //Click method for the service management button - opens service management activity
		 public void serviceClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
		 }
		 
		 //click method for the customer management button - opens customer management view
		 public void customerClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
		 }
		 
		 //Click method for the reports button - opens the report view
		 public void helpClick(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);  
		 }
		
		 
		 //Click method for the logout button - logs user out and returns to login screen
		 public void logoutClick(View view){
			 super.finish();
			 
		 }
		 
			 
			}

package GRS.stem;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Implemtation for {@link MenuView}
 * @author csmith
 *
 */
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
		 public void button1Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					 // insert the web address for button 1 here
					 // button 1 is the top left button
					"http://google.com"
					 //"http://pc.fsu.edu"
					 ));
		    	startActivity(browserIntent);  	
		 }
		 
		 //Click method for the create WO button - opens create WO activity
		 public void button2Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					// insert the web address for button 2 here
					 // button 2 is the top center button
						"http://google.com"
					 //"http://www.defense.gov/"
					 
					 ));
		    	startActivity(browserIntent);
			 
		 }  

		 //Click method for the open WO button - opens "open WO" activity
		 public void button3Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					// insert the web address for button 3 here
					 // button 3 is the top right button
						"http://google.com"
					 //"http://www.dep.state.fl.us/"
					 
					 ));
		    	startActivity(browserIntent); 
		 }
		    
		 //Click method for the service management button - opens service management activity
		 public void button4Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					// insert the web address for button 4 here
					 // button 4 is the bottom left button
						"http://google.com"
					 //"http://www.navsea.navy.mil/default.aspx"
					 
					 ));
		    	startActivity(browserIntent);
		 }
		 
		 //click method for the customer management button - opens customer management view
		 public void button5Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					// insert the web address for button 5 here
					 // button 5 is the bottom center button
						"http://google.com"
					 //"http://www.gulfpower.com/"
					 
					 ));
		    	startActivity(browserIntent);
		 }
		 
		 //Click method for the reports button - opens the report view
		 public void button6Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
					// insert the web address for button 6 here
					 // button 6 is the bottom right button
						"http://google.com"
					 //"http://www.need.org/"
					 
					 ));
		    	startActivity(browserIntent);  
		 }
		
		 
		//Click method for buttonBottom
		 public void bottomClick(View view){
			 super.finish();
			 
		 }
		 
			 
}

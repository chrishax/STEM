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
		
		//Click method for button1
		 public void button1Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);  	
		 }
		 
		//Click method for button2
		 public void button2Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
			 
		 }  

		//Click method for button3
		 public void button3Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent); 
		 }
		    
		//Click method for button4
		 public void button4Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
		 }
		 
		//Click method for button5
		 public void button5Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);
		 }
		 
		//Click method for button6
		 public void button6Click(View view){
			 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
		    	startActivity(browserIntent);  
		 }
		
		 
		//Click method for buttonBottom
		 public void bottomClick(View view){
			 super.finish();
			 
		 }
		 
			 
}

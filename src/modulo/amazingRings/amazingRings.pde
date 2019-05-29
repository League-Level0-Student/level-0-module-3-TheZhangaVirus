int x = 35;
int ellipse = 580;
int e1Xval = 300;
int e2Xval = 900;


void setup() {
  
  size(1200, 600);
  background(200, 200, 200);
  
}


void draw() {
  
  background(200, 200, 200);
  
  if(e1Xval <= 300) {
   e1Xval++; 
  } else if(e1Xval >= 900) {
   e1Xval--; 
  }
  
  if(e2Xval >= 900) {
   e2Xval--;  
  } else if(e2Xval <= 300) {
   e2Xval++; 
  }
  
  
      noFill();
    for(int i = 1; i <= 16; i++){
      int ellipse2 = ellipse - (i * x);
        ellipse(e1Xval, 300, ellipse2, ellipse2);
        
      noFill();  
    for(int l = 1; l <= 20; l++){
        ellipse(e2Xval, 300, ellipse2, ellipse2);
    }
  }
}

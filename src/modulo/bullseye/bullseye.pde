int x = 55;
int ellipse = 585;


void setup() {
  size(600, 600);
}

void draw() {
    noStroke();
    for(int i = 1; i <= 10; i++){
      if((ellipse + 35) % 2 == 0) {
        fill(255, 0, 0 );
        //ellipse(300, 300, ellipse - (i * x), ellipse - (i * x));
      } else if(ellipse % 5 == 0) {
        fill(0, 0, 0); 
        //ellipse(300, 300, ellipse - (i * x), ellipse - (i * x));
      }
        ellipse(300, 300, ellipse - (i * x), ellipse - (i * x));
  }
}

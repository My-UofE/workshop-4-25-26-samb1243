// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  //changed to private width
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double w, double h, double oX, double oY) {
    this.width = w;
    this.height = h;
    this.originX = oX;
    this.originY = oY;
  }

  // second constructor 

  public Rectangle(double width, double height){
    this(width, height, 0, 0);
  }

  // third constructor 

  public Rectangle(){
    this(0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // method: change scale of rectangle for each coord 
  public void scale (double scaleX, double scaleY){
    width *= scaleX;
    height *= scaleY;
  }

  //method: change scale for both 
  public void scale(double scale){
    scale(scale, scale);
  }

  //task 2
  //check overlapping method

  public boolean isOverlappedWith (Rectangle r){
    double leftA = this.originX;
    double rightA = this.originX + this.width;
    double topA = this.originY;
    double bottomA = this.originY + this.height;

    double leftB = r.originX;
    double rightB = r.originX + r.width;
    double topB = r.originY;
    double bottomB = r.originY + r.height;

    if (rightA <= leftB || rightB <= leftA || bottomA <= topB || bottomB <= topA ){
      return false;
    }

    return true;

  }

  //check ratio method
  public double calcRatio() {
    return width/height;
  }

  //check if the rect is a square
  public boolean isSquare(){
    if (width == height){
      return true;
    }
    else{
      return false;
    }
  }


  //task 3 

  //getter and setter for width
  // for each attribute provide getter method
  public double getWidth(){ 
    return width;
  }

  // for each attribute provide setter method
  public void setWidth(double width){
    this.width = width;
  }

  //for height 

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }

  //for x and y

  public double getoriginX(){
    return originX;
  }

  public void setoriginX(){
    this.originX = originX;
  }

  //for x and y

  public double getoriginY(){
    return originY;
  }

  public void setoriginY(){
    this.originX = originY;
  }
}

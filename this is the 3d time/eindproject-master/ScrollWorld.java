import greenfoot.*;
 
public class ScrollWorld extends World
{
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi = new GreenfootImage("Flat Night 2 BG.png"); 
    int bgiWidth = bgi.getWidth();
 
   public ScrollWorld()
    {    
        super(800, 720, 1);
        update();
    }
     
    public void act()
    {
        baseX = (baseX + bgiWidth - 1) % bgiWidth;
        update();
    }
     
    private void update()
    {
        if (baseX != 0) getBackground().drawImage(bgi, baseX - bgiWidth, 0);
        if (baseX < getWidth()) getBackground().drawImage(bgi, baseX, 0);
    }
}

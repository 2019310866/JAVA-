# JAVA-
JAVA课程作业

# 阅读程序
```
package pack;

 public class Text {
 public static void main(String args[]){
  
  CPU cpu =new CPU();
  
  cpu.setSpeed(3000);
  
  HardDisk disk=new HardDisk();
  
  disk.setAmount(500);
  
  PC pc=new PC();
  pc.setCPU(cpu);
  pc.setHardDisk(disk);
pc.show();
  
 }

}
 
 class CPU {
  int speed;
  int getSpeed(){
   return speed;
  }
  public void setSpeed(int speed){
   this.speed=speed;
  }

 }
 
class HardDisk {
  int amount;
  int getAmount(){
   return amount;
  }
  public void setAmount(int amount){
   this.amount=amount;
  }

 }
 
 class PC {
  CPU cpu;
  HardDisk disk;
  void setCPU(CPU cpu){
   this.cpu=cpu;
  }
  void setHardDisk(HardDisk disk){
   this.disk=disk; 
  }
  void show(){
   System.out.println("CPU速度"+cpu.getSpeed());
   System.out.println("硬盘容量"+disk.getAmount());
  }

 }
 ```
## 实验目的
用类描述计算机的cpu速度和硬盘容量

## 实验过程
1创建项目，在项下面创建package
2创建CPU类，用创建参数speed，给speed赋值
3创建HardDisk类，运用参数amonut
4创建PC类，为CPU HardDisk赋值创建函数show（）
5创建主类Text 调用上述函数，并赋值显示

## 核心方法
1.CPU
```
public class CPU {
	int speed;
	int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
```

2.HardDisk
```
public class HardDisk {

int amount;
int getAmount(){
	return amount;
}
public void setAmount(int amount){
	this.amount=amount;
}

}
```
3.PC
```
public class PC {

	CPU cpu;
	HardDisk disk;
	void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	void setHardDisk(HardDisk disk){
		this.disk=disk;	
	}
	void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("硬盘容量"+disk.getAmount());
	}

}
```
4.Text
```
public class Test {
	public static void main(String args[]){
		
		CPU cpu =new CPU();
		
		cpu.setSpeed(2200);
		
		HardDisk disk=new HardDisk();
		
		disk.setAmount(200);
		
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
pc.show();
		
	}

}
```
## 实验结果
CPU速度2200
硬盘容量200

## 实验感想
通过本次实验让我了解了参数的使用方法，并且能够熟练地使用Eclipse，并且掌握是使用方法

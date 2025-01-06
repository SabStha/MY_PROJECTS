
var numberoflength = document.querySelectorAll(".drum").length

for (i=0; i< numberoflength; i++) {
    document.querySelectorAll("button")[i].addEventListener("click" , function(){
    var buttonclick = this.innerHTML;
    makeSound(buttonclick);
    buttonanimation(buttonclick);

    });
        
    document.addEventListener("keypress", function(event){
    makeSound(event.key);
    buttonanimation(event.key);
    });

    function makeSound(key){
        switch (key) {
            case "w":
                var crash1 = new Audio("sounds/crash.mp3");
                crash1.play();
                break;
        
            case "a":
                var kick1 = new Audio("sounds/kick-bass.mp3");
                kick1.play();
                break;    
        
        
            case "s":
                var snare1 = new Audio("sounds/snare.mp3");
                snare1.play();
                break;
        
            case "d":
                var tom1 = new Audio("sounds/tom-1.mp3");
                tom1.play();
                break;        
       
            case "j":
                var tom2 = new Audio("sounds/tom-2.mp3");
                tom2.play();
                break;    
            
            case "k":
                var tom3 = new Audio("sounds/tom-3.mp3");
                tom3.play();
                break;  

            case "l":
                var tom4 = new Audio("sounds/tom-4.mp3");
                tom4.play();
                break;   
            default:
                
        }

    }

    function buttonanimation (current_key){
        var activeKey =  document.querySelector("." + current_key);

        activeKey.classList.add("pressed");

        setTimeout ( function (){
            activeKey.classList.remove("pressed")
    }, 100)

    }
        
    

}

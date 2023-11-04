// // there are two methods for this one with using Stack and another with simple array 
// // both have same kind of logic and little different in end 


class Solution {
    
         class Car {
             
            int position ;
            int speed ;
        
            public Car(int position , int speed )
            {
                this.position = position ;
                this.speed = speed;
            }
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        
        Car[] car = new Car[N];
        // make an array of two different position and speed 
        for(int i=0;i<N;i++)
        {
            car[i] = new Car(position[i] , speed[i]);
        }
        
        // now sort on based of position as we've written logic 
        Arrays.sort(car ,(a,b)-> a.position-b.position);
        
        Stack<Double> st = new Stack();
        
        for(int i=N-1;i>=0;i--)
        {
            double time = (double)(target-car[i].position)/car[i].speed;
            
            //while(!st.isEmpty() && st.peek()>=time)
            if(!st.isEmpty() && st.peek()>=time)
            {
                //st.pop();
                // here change don't delete the item just skip and check for next one 
                // dry run then you will get to know 
                continue;
            }
            st.push(time);
        }
        return st.size();
    }
    
    
}
     


// this one is using Array only this is also simple 

// class Solution {
//     public int carFleet(int target, int[] position, int[] speed) {
//         int n = position.length;
//         Car[] cars = new Car[n];

//         for (int i = 0; i < n; i++) {
//             cars[i] = new Car(position[i], speed[i]);
//         }

//         Arrays.sort(cars, (x, y) -> Integer.compare(y.position, x.position));

//         int fleetsCount = 0;
//         double lastCarArrivalTime = 0;

//         for (Car car : cars) {
//             double arrivalTime = (target - car.position) / (double) car.speed;

//             if (arrivalTime > lastCarArrivalTime) {
//                 fleetsCount++; // new fleet formed
//                 lastCarArrivalTime = arrivalTime;
//             }
//         }

//         return fleetsCount;
//     }

//     private static class Car {
//         public int position;
//         public int speed;

//         public Car(int position, int speed) {
//             this.position = position;
//             this.speed = speed;
//         }
//     }
// }






// class Solution {
    
//     class Car {
//         int position;
//         int speed;
//         public Car(int position, int speed) {
//             this.position = position;
//             this.speed = speed;
//         }
//     }
    
//     public int carFleet(int target, int[] position, int[] speed) {
//         Car[] cars = new Car[position.length];
//         for (int i = 0; i < position.length; i++) {
//             cars[i] = new Car(position[i], speed[i]);
//         }
        
//         // sort cars in ascending order by position
//         Arrays.sort(cars, (a, b) -> a.position - b.position);
        
//         Stack<Double> fleets = new Stack<>();
//         for (int i = cars.length - 1; i >= 0; i--) {
//             // calculate how many seconds before this car reaches the target
//             double time = (double) (target - cars[i].position) / cars[i].speed;
//             // check if this car will get stuck behind a car that was ahead
//             if (!fleets.isEmpty() && time <= fleets.peek()) {
//                 // keep the slower car ahead's time on the top of the stack
//                 // because it will block any faster cars from behind
//                 continue;
//             }
//             fleets.push(time);
//         }
        
//         return fleets.size();
//     }
// }

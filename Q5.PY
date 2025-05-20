import tkinter as tk
import random
 
# Window setup
root = tk.Tk()
root.title("Catch the Ball")
root.geometry("400x500")
canvas = tk.Canvas(root, width=400, height=500, bg="lightblue")
canvas.pack()
 
# Paddle setup
paddle = canvas.create_rectangle(160, 480, 240, 490, fill="blue")
 
# Ball setup
ball = canvas.create_oval(0, 0, 20, 20, fill="red")
ball_speed = 5
 
# Score
score = 0
score_text = canvas.create_text(10, 10, anchor='nw', text=f"Score: {score}", font=("Arial", 14, "bold"))
 
# Move Paddle
def move_left(event):
    canvas.move(paddle, -20, 0)
 
def move_right(event):
    canvas.move(paddle, 20, 0)
 
root.bind("<Left>", move_left)
root.bind("<Right>", move_right)
 
# Ball drop logic
def drop_ball():
    global score
    x = random.randint(0, 380)
    canvas.coords(ball, x, 0, x + 20, 20)
    
    def fall():
        global score  # This line fixes the UnboundLocalError
        pos = canvas.coords(ball)
        if pos[3] < 500:
            canvas.move(ball, 0, ball_speed)
            root.after(20, fall)
        else:
            paddle_pos = canvas.coords(paddle)
            # Check if ball overlaps paddle horizontally
            if paddle_pos[0] < pos[2] and paddle_pos[2] > pos[0]:
                score += 1
                canvas.itemconfig(score_text, text=f"Score: {score}")
            drop_ball()
    
    fall()
 
drop_ball()
 
root.mainloop()

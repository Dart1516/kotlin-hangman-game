from tkinter import *
import random
from tkinter import messagebox


def main():
    ventana = Tk()
    ventana.title("Save the Snow Dall")
    ventana.geometry("1820x980")
    imagen_para_fondo = PhotoImage(file="0.png")
    fondo = Label(image=imagen_para_fondo)
    fondo.place(x=0, y=0, relwidth=1, relheight=1)

    images = [PhotoImage(file="h0.png"), PhotoImage(file="h1.png"),
              PhotoImage(file="h2.png"), PhotoImage(file="h3.png"),
              PhotoImage(file="h4.png"), PhotoImage(file="h5.png"),
              PhotoImage(file="h6.png"), PhotoImage(file="h7.png"),
              PhotoImage(file="h8.png"), PhotoImage(file="h9.png")]

    letters_List = ['la', 'lb', 'lc', 'ld', 'le', 'lf', 'lg', 'lh', 'li',
                    'lj', 'lk', 'll', 'lm', 'ln', 'lo', 'lp', 'lq', 'lr',
                    'ls', 'lt', 'lu', 'lv', 'lw', 'lx', 'ly', 'lz']

    letraA = PhotoImage(file=f"{letters_List[0]}.png")
    letraB = PhotoImage(file=f"{letters_List[1]}.png")
    letraC = PhotoImage(file=f"{letters_List[2]}.png")
    letraD = PhotoImage(file=f"{letters_List[3]}.png")
    letraE = PhotoImage(file=f"{letters_List[4]}.png")
    letraF = PhotoImage(file=f"{letters_List[5]}.png")
    letraG = PhotoImage(file=f"{letters_List[6]}.png")
    letraH = PhotoImage(file=f"{letters_List[7]}.png")
    letraI = PhotoImage(file=f"{letters_List[8]}.png")
    letraJ = PhotoImage(file=f"{letters_List[9]}.png")
    letraK = PhotoImage(file=f"{letters_List[10]}.png")
    letraL = PhotoImage(file=f"{letters_List[11]}.png")
    letraM = PhotoImage(file=f"{letters_List[12]}.png")
    letraN = PhotoImage(file=f"{letters_List[13]}.png")
    letraO = PhotoImage(file=f"{letters_List[14]}.png")
    letraP = PhotoImage(file=f"{letters_List[15]}.png")
    letraQ = PhotoImage(file=f"{letters_List[16]}.png")
    letraR = PhotoImage(file=f"{letters_List[17]}.png")
    letraS = PhotoImage(file=f"{letters_List[18]}.png")
    letraT = PhotoImage(file=f"{letters_List[19]}.png")
    letraU = PhotoImage(file=f"{letters_List[20]}.png")
    letraV = PhotoImage(file=f"{letters_List[21]}.png")
    letraW = PhotoImage(file=f"{letters_List[22]}.png")
    letraX = PhotoImage(file=f"{letters_List[23]}.png")
    letraY = PhotoImage(file=f"{letters_List[24]}.png")
    letraZ = PhotoImage(file=f"{letters_List[25]}.png")

    boton1 = Button(ventana, command=lambda: [check(boton1), guess("A")], bg="#49A", activebackground="gray",
                    image=letraA)
    boton1.place(x=490, y=850)
    boton2 = Button(ventana, command=lambda: [check(boton2), guess("B")], bg="#49A", activebackground="gray",
                    image=letraB)
    boton2.place(x=560, y=850)
    boton3 = Button(ventana, command=lambda: [check(boton3), guess("C")], bg="#49A", activebackground="gray",
                    image=letraC)
    boton3.place(x=630, y=850)
    boton4 = Button(ventana, command=lambda: [check(boton4), guess("D")], bg="#49A", activebackground="gray",
                    image=letraD)
    boton4.place(x=700, y=850)
    boton5 = Button(ventana, command=lambda: [check(boton5), guess("E")], bg="#49A", activebackground="gray",
                    image=letraE)
    boton5.place(x=770, y=850)
    boton6 = Button(ventana, command=lambda: [check(boton6), guess("F")], bg="#49A", activebackground="gray",
                    image=letraF)
    boton6.place(x=840, y=850)
    boton7 = Button(ventana, command=lambda: [check(boton7), guess("G")], bg="#49A", activebackground="gray",
                    image=letraG)
    boton7.place(x=910, y=850)
    boton8 = Button(ventana, command=lambda: [check(boton8), guess("H")], bg="#49A", activebackground="gray",
                    image=letraH)
    boton8.place(x=980, y=850)
    boton9 = Button(ventana, command=lambda: [check(boton9), guess("I")], bg="#49A", activebackground="gray",
                    image=letraI)
    boton9.place(x=1050, y=850)
    boton10 = Button(ventana, command=lambda: [check(boton10), guess("J")], bg="#49A", activebackground="gray",
                     image=letraJ)
    boton10.place(x=1120, y=850)
    boton11 = Button(ventana, command=lambda: [check(boton11), guess("K")], bg="#49A", activebackground="gray",
                     image=letraK)
    boton11.place(x=1190, y=850)
    boton12 = Button(ventana, command=lambda: [check(boton12), guess("L")], bg="#49A", activebackground="gray",
                     image=letraL)
    boton12.place(x=1260, y=850)
    boton13 = Button(ventana, command=lambda: [check(boton13), guess("M")], bg="#49A", activebackground="gray",
                     image=letraM)
    boton13.place(x=1330, y=850)
    boton14 = Button(ventana, command=lambda: [check(boton14), guess("N")], bg="#49A", activebackground="gray",
                     image=letraN)
    boton14.place(x=490, y=900)
    boton15 = Button(ventana, command=lambda: [check(boton15), guess("O")], bg="#49A", activebackground="gray",
                     image=letraO)
    boton15.place(x=560, y=900)
    boton16 = Button(ventana, command=lambda: [check(boton16), guess("P")], bg="#49A", activebackground="gray",
                     image=letraP)
    boton16.place(x=630, y=900)
    boton17 = Button(ventana, command=lambda: [check(boton17), guess("Q")], bg="#49A", activebackground="gray",
                     image=letraQ)
    boton17.place(x=700, y=900)
    boton18 = Button(ventana, command=lambda: [check(boton18), guess("R")], bg="#49A", activebackground="gray",
                     image=letraR)
    boton18.place(x=770, y=900)
    boton19 = Button(ventana, command=lambda: [check(boton19), guess("S")], bg="#49A", activebackground="gray",
                     image=letraS)
    boton19.place(x=840, y=900)
    boton20 = Button(ventana, command=lambda: [check(boton20), guess("T")], bg="#49A", activebackground="gray",
                     image=letraT)
    boton20.place(x=910, y=900)
    boton21 = Button(ventana, command=lambda: [check(boton21), guess("U")], bg="#49A", activebackground="gray",
                     image=letraU)
    boton21.place(x=980, y=900)
    boton22 = Button(ventana, command=lambda: [check(boton22), guess("V")], bg="#49A", activebackground="gray",
                     image=letraV)
    boton22.place(x=1050, y=900)
    boton23 = Button(ventana, command=lambda: [check(boton23), guess("W")], bg="#49A", activebackground="gray",
                     image=letraW)
    boton23.place(x=1120, y=900)
    boton24 = Button(ventana, command=lambda: [check(boton24), guess("X")], bg="#49A", activebackground="gray",
                     image=letraX)
    boton24.place(x=1190, y=900)
    boton25 = Button(ventana, command=lambda: [check(boton25), guess("Y")], bg="#49A", activebackground="gray",
                     image=letraY)
    boton25.place(x=1260, y=900)
    boton26 = Button(ventana, command=lambda: [check(boton26), guess("Z")], bg="#49A", activebackground="gray",
                     image=letraZ)
    boton26.place(x=1330, y=900)

    hangman_images = Label(ventana)
    hangman_images.place(x=1000, y=525)
    white_spaces = StringVar()
    Label(ventana, textvariable=white_spaces, bg="#8bccd3", font='verdana 30 bold').place(x=800, y=400)

    def white_spaces_dashboard():
        global dashboard_in_white
        global number_of_guesses
        global the_word
        the_word = pick_secret_word()
        number_of_guesses = 0
        dashboard_in_white = " ".join(the_word)
        white_spaces.set(' '.join("_" * len(the_word)))

    def new_game_button():
        # set a new game
        Button(ventana, text="Exit Game",
               command=lambda:  close(ventana), font="Verdana 16 bold", padx=20, pady=20,
               activebackground="gray").place(x=1400, y=850)

    def guess(letter):
        global number_of_guesses

        if number_of_guesses < 10:
            txt = list(dashboard_in_white)
            guessed = list(white_spaces.get())
            if dashboard_in_white.count(letter) > 0:
                for each_try in range(len(txt)):
                    if txt[each_try] == letter:
                        guessed[each_try] = letter
                    white_spaces.set("".join(guessed))
                    if white_spaces.get() == dashboard_in_white:
                        messagebox.showinfo("Hangman", "You guessed it!")
            else:
                number_of_guesses += 1
                hangman_images.config(image=images[number_of_guesses], bg="#6daeef")
                if number_of_guesses == 9:
                    messagebox.showwarning("Hangman Game Over", f" The secret word was: \n {the_word}")
                    ventana.destroy()

    def instructions(en_ventana):
        Label(en_ventana, text="Welcome To save the Snow-doll",
              bg="#4c7daf", font='verdana 36 bold').place(x=560,y=10)
        Label(en_ventana, text="Rules:",
              bg="#2596be", font='verdana 14 bold').place(x=560, y=100)
        Label(en_ventana, text="- You have 8 tries before the snow-doll end hangout        \n"
                               "- if you lose and you want to repeat again restar the game \n"
                               "- The words are Christmas related.                         \n"
                               "- Good Luck and Have fun.                                    ",
              bg="#2596be", font='verdana 12 bold').place(x=560, y=150)

    instructions(ventana)
    white_spaces_dashboard()
    new_game_button()
    ventana.mainloop()


def check(button_to_be_deleted):
    button_to_be_deleted.destroy()

def pick_secret_word():
    words = []
    with open("Christmas_words.txt", "rt") as list_of_words:
        for a_word in list_of_words:
            a_word = a_word.strip().upper()
            words.append(a_word)
    randon_word = random.choice(words)
    return randon_word

def close(ventana):
    answer = messagebox.askyesno('ALERT','YOU WANT TO EXIT THE GAME?')
    if answer == True:
        ventana.destroy()

if __name__ == "__main__":
    main()

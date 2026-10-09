from tkinter import *
from hangman_snowdoll import  pick_secret_word, check, close
import pytest

def test_close():
    ventana = Tk()
    assert close(ventana) == None

def test_pick_secret_word():
    list_of_words = []
    with open("Christmas_words.txt", "rt") as file:
        for a_word in file:
            a_word = a_word.strip()
            list_of_words.append(a_word.upper())
    for _ in range(15):
        word = pick_secret_word()
        assert word in list_of_words

def test_check():
    ventana = Tk()
    assert check(ventana)==None




pytest.main(["-v", "--tb=line", "-rN", __file__])
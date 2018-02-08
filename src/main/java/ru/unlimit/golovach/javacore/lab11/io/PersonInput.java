package ru.unlimit.golovach.javacore.lab11.io;

import java.io.IOException;

interface PersonInput{
	Person readPerson() throws IOException;
}
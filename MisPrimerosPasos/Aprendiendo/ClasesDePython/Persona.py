class Persona:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad

    def mostrar_persona(self):
        print(f"Nombre ", self.nombre,"Edad ", self.edad)

    def cambiar_edad(self,nueva_edad):
        self.edad=nueva_edad-10


    
    
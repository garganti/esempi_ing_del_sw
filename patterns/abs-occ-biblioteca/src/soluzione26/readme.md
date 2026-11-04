Il diagramma rappresenta una relazione uno a molti: un Title può essere associato a più oggetti LibraryItem, mentre ogni LibraryItem è associato a un solo Title.

La lista items realizza la molteplicità *: un titolo può avere zero o più copie. Il riferimento title in LibraryItem realizza invece la molteplicità 1: ogni copia deve essere associata a un titolo. addItem() aggiorna entrambi i lati della relazione durante la creazione della copia.

Ad esempio, Title rappresenta un libro come opera editoriale; 
i suoi LibraryItem rappresentano le singole copie presenti in biblioteca, ciascuna identificata da un codice a barre.
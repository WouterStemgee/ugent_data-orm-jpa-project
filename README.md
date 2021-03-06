# Project JPA
> groep-15

## Opdrachten
- [x] De datalaag bevat minstens één 1-1-relatie, 1-n-relatie en één n-n-relatie.
- [x] Voorzie een relatie met en zonder cascade.
- [x] De datalaag bevat overerving.
- [x] De datalaag heeft één of meerdere value-objecten.
- [x] Met de datalaag kan je één object toevoegen.
- [x] Met de datalaag kan je een verzameling van objecten toevoegen.
- [x] Met de datalaag kan je objecten opvragen. Voorzie zowel een "lazy" als niet "lazy" opvraging.
- [x] De datalaag heeft ook een opvraging die gebruik maakt van parameters.
- [x] Met de datalaag kan je objecten aanpassen.
- [x] Schrijf voor elke functionaliteit een JUnit-test die het gebruik en de mogelijke speciale gevallen illustreert.

## Testen
### Overzicht geteste functionaliteit
#### addZoo()
- object toevoegen
- heeft value-object (Address)

#### addZooWithOwner()
- 1-1-relatie
- heeft value-object (Address)

#### addZooWithDepartments()
- 1-n-relatie
- verzameling van objecten toevoegen
- niet "lazy" opvraging
- relatie met cascade

#### addDepartmentWithAnimals()
- 1-n-relatie
- "lazy" opvraging
- overerving (hiërarchie vertaalt naar 1 tabel met discriminator)

#### addDepartmentsWithKeepers()
- n-n-relatie (join tabel = "zookeepers_per_departments")
- relatie zonder cascade

#### updateZooAddress()
- objecten aanpassen
- opvraging die gebruik maakt van parameters

## UML Klassendiagram
![](https://i.imgur.com/hKNjG9U.png)

## Database
![](https://i.imgur.com/uHRi10e.png)
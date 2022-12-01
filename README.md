# Java tutorials

Porozwiązujemy parę zadań tutaj razem i wrzucimy w jedno miejsce żeby je ładnie uporządkować.

## Jak ściągnąć?

Po założeniu GitHuba i skonfigurowaniu SSLowego połączenia ( [link tutaj](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent) )

1. Przejdz do folderu git/:
```
$ cd ~/Develop/git
```

2. Sklonuj repozytorium na dysk
```
$ git clone git@github.com:peterpoliwoda/java-tutorials.git
```

3. Otwórz projekt w IntelliJ.

## Zapisywanie plików do GitHuba

Co zrobić po stworzeniu plików w celu zapisania żeby nie zgubić gdyby laptop spadł ze stołu.

Po stworzeniu pliku z zadaniem i napisaniu rozwiązania (np. Task9.java), wykonaj takie komendy w Terminalu:

Dodaj pliki do commita:
```
$ git add .
```

Stworz commita z opisem jego treści (np. "Rozwiązanie zadania nr 9" ):
```
$ git commit -m "Rozwiazanie zadania nr 9"
```

Popchnij do GitHuba
```
$ git push origin HEAD
```

## Synchronizacja z repozytorium po zmianach innej osoby:

Po jakichś zmianach ode mnie możesz sobie zaciągnąć znowu z GitHuba ostatnie zmiany ode mnie. Można to zrobić w ten sposób:

```
$ git fetch origin
```

```
$ git rebase origin/master
```

**Notatka:** Możesz zobaczyć w internecie bardzo popularną komendę `git pull`. Ona robi mw to samo co te dwie komendy powyżej, ale psuje nam historię, a tego nie chcemy.


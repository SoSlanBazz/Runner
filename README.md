        Project Runner
Метод принимает на вход строку длинною 16 символов, описывающих клетки игрового поля 4х4, а также строку, содержащую расу существа.
Метод возвращает минимальные затраты существа на преодоление расстояния из стартовой позиции (верхний левый угол) в конечную позицию
(нижний правый угол).
        Перемещение происходит по следующим правилам:
 1. Существо может перемещаться только вверх, вниз, влево, вправо.
 2. Стоимость перемещения зависит от типа клетки и от расы существа в соответствии с таблицей ниже.
 3. Стоимость перемещения по стартовой клетке не входит в затраты, а вот по конечной - входит.

    S - Болото, W - Вода, T - Кусты, P - Равнина.                                
   Human (Человек)  S - 5, W -  2, T - 3, P - 1.
   Swamper (Болотник) S - 2, W - 2, T - 5, P - 2.
   Woodman (Леший)  S - 3,  W - 3, T - 2, P - 2.

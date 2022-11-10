for (Spell spell : spells)
 System.out.println(spell.name);

spells.stream().forEach(s -> System.out.println(s));

for (Spell spell : spells)
{
 if (spell.type == Spell.SpellType.SPELL)
 System.out.println(spell.name);
}

spells.stream()
 .filter(s -> s.type == Spell.SpellType.SPELL)
 .forEach(s -> System.out.println(s));

OptionalDouble avg = spells.stream()
 .mapToDouble(s -> s.price)
 .average();
if (avg.isPresent())
{
 System.out.println("Average = "
 + avg.getAsDouble());
}
spells.parallelStream()
 .forEach(s -> System.out.println(s));
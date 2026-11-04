public interface Visitor {
    void visitActor(Actor actor);
    void visitScene(Scene scene);
    void visitSpecialEffect(SpecialEffect effect);
    void visitEquipment(Equipment equipment);
}

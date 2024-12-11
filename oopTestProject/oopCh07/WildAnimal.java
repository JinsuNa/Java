package oopCh07;

public abstract class WildAnimal implements WildMoveInterface {
    public abstract void attack();

    @Override
    public void up() {
        System.out.println("위로이동");
    }

    @Override
    public void down() {
        System.out.println("아래로 이동");
    }

    @Override
    public void left() {
        System.out.println("좌로 이동");
    }

    @Override
    public void right() {
        System.out.println("우로 이동");
    }

    @Override
    public void hide() {
        System.out.println("숨기");
    }
}

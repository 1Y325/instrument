abstract class Instrument

{
    public abstract void Play();
}
class Piano extends Instrument
{
    @Override
    public void Play()

    {
        System.out.println("Piano  playing tan tan tan tan");
    }
}
class Flute extends Instrument
{
    @Override
    public void Play()

    {
        System.out.println("Flute is playing toot toot toot toot ");
    }
}
class Guitar extends Instrument
{
    @Override
    public void Play()

    {
        System.out.println("Guitar  playing tin tin tin");
    }
}
class instrument
{
    public static void main(String args[])
    {
        Instrument arr[]=new Instrument[10];

        for (int i=0;i<arr.length;i++)
        {
            switch (i%3)
            {
                case 0: { arr[i] = new Piano(); break;
                }

                case 1: {arr[i]= new Flute(); break;
                }

                case 2: { arr[i] = new Guitar(); break;
                }
            }
        }
        for (int i=0; i< arr.length;i++)
        {
            System.out.println( (i+1));

            arr[i].Play();
            if (arr[i] instanceof Piano){
            System.out.println("Piano");
             }
            if (arr[i] instanceof Flute)
            { System.out.println("Flute");
            }
            if (arr[i] instanceof Guitar)
            { System.out.println("Guitar");
            }
        }
    }
}



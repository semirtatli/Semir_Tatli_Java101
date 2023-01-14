import java.util.Scanner;

public class mineSweeper {
    int row;
    int column;
    char[][] ground;

    char[][] playGround;
    public mineSweeper(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void init(){
        ground = new char[row + 1][column + 1];
        playGround = new char[row + 1][column + 1];
        int bombNum = row * column / 4;

        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= column; j++){

                if(i == 0) {
                    ground[i][j] = (char) (j + '0');
                    playGround[i][j] = (char) (j + '0');
                }
                else if(j == 0) {
                    ground[i][j] = (char) (i + '0');
                    playGround[i][j] = (char) (i + '0');
                }
                else {
                    ground[i][j] = '-';
                    playGround[i][j] = '-';
                }
            }

        }

        for(int i = 0; i < bombNum; i++){
            int bombRow = (int) (1 + (Math.random() * row));
            int bombColumn = (int) (1 + (Math.random() * column));

            if(ground[bombRow][bombColumn] == '*'){
                i--;
            }
            else
                ground[bombRow][bombColumn] = '*';
        }

        play();

    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        int rowChoice;
        int columnChoice;
        int bombCount = 0;
        int count = 0;
        boolean isWin = false;

        while(!isWin) {
            printGround(playGround);
            System.out.print("Lütfen satır numarasını giriniz: ");
            rowChoice = sc.nextInt();
            System.out.print("Lütfen sütun numarasını giriniz: ");
            columnChoice = sc.nextInt();

            if(rowChoice < 1 || rowChoice > row || columnChoice < 1 || columnChoice > column){
                System.out.println("Lütfen geçerli sayılar giriniz");
                continue;
            }

            if(ground[rowChoice][columnChoice] == '*') {
                System.out.println("Oyunu kaybettiniz");
                printGround(ground);
                break;
            } else {
                bombCount = 0;
                if(rowChoice > 1 && columnChoice > 1 && (ground[rowChoice - 1][columnChoice - 1] == '*'))
                    bombCount++;
                if(rowChoice > 1 && (ground[rowChoice - 1][columnChoice] == '*'))
                    bombCount++;
                if(rowChoice > 1 && columnChoice < column && (ground[rowChoice - 1][columnChoice + 1] == '*'))
                    bombCount++;
                if(columnChoice > 1 && (ground[rowChoice][columnChoice - 1] == '*'))
                    bombCount++;
                if(columnChoice < column && (ground[rowChoice][columnChoice + 1] == '*'))
                    bombCount++;
                if(rowChoice < row && columnChoice > 1 && (ground[rowChoice +1][columnChoice - 1] == '*'))
                    bombCount++;
                if(rowChoice < row && (ground[rowChoice + 1][columnChoice] == '*'))
                    bombCount++;
                if(rowChoice < row && columnChoice < column && (ground[rowChoice + 1][columnChoice + 1] == '*'))
                    bombCount++;

                playGround[rowChoice][columnChoice] = (char)(bombCount + '0');
                count++;
            }

            if(count == row*column - row * column / 4){
                isWin = true;
            }


        }

        if(isWin){
            System.out.println("Tebrikler, oyunu kazandınız!");
        }
    }

    public void printGround(char [][]mine){

        //Printing the ground
        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= column; j++){

                System.out.print(mine[i][j] + " ");
            }
            System.out.println();
        }

    }




}

package arvoreb;
//melhorar algumas ligações não ficam com null, (mas estão sendo controladas pelo tl)
//procurar o substituto dos dois lados, se da direita precisar fundir, pega da esquerda


public class Principal 
{
    
    public static void main(String[] args) 
    {
        ArvoreB arvore;
        arvore = new ArvoreB();
        for(int i =0 ; i< 40; i++)
            arvore.insereArvore(i);
        
        arvore.InOrdem();
        System.out.println();
        
        for(int i = 0; i<40; i++)
        {
            arvore.exclui(i);
            arvore.InOrdem();
            System.out.println();
        }
        
//        arvore.insereArvore(6);
//        arvore.insereArvore(8);
//        arvore.insereArvore(4);
//        arvore.insereArvore(18);
//        arvore.insereArvore(43);
//        arvore.insereArvore(84);
//        arvore.insereArvore(45);
//        arvore.insereArvore(13);
//        arvore.insereArvore(62);
//        arvore.insereArvore(85);
//        arvore.insereArvore(41);
//        arvore.insereArvore(12);
//        
//        
//        arvore.insereArvore(25);
//        arvore.insereArvore(70);
//        arvore.insereArvore(90);
//        arvore.insereArvore(95);
//        arvore.insereArvore(75);
        
//        arvore.insereArvore(98);
//        arvore.insereArvore(100);
//        arvore.insereArvore(102);
        
//        arvore.insereArvore(26);
//        arvore.insereArvore(28);
//        arvore.insereArvore(36);
//        
//        arvore.InOrdem();
//        System.out.println();
//        arvore.exclui(45);
//        
//        
//         arvore.exclui(6);
//         arvore.exclui(18);
//         arvore.exclui(13);
//         arvore.exclui(12);
//         arvore.exclui(41);
//         arvore.exclui(43); 
//         arvore.exclui(8);
//         arvore.exclui(62);
//         arvore.exclui(4);
//         arvore.exclui(45); 
//         arvore.exclui(84);
//         arvore.exclui(85);
         
//         arvore.InOrdem();
    }
    
}



#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
void append(struct Node **head,int data){
    struct Node *new_node=(struct Node*)malloc(sizeof(struct Node));

    new_node->data=data;
    new_node->next=(*head);

    (*head)=new_node;

}

void display(struct Node *temp){

    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }

}
void main(){
    struct Node *head=NULL;
    printf("Enter the number of elements:");
    int n;
    scanf("%d",&n);

    for(int i=0;i<n;i++){

        int val;
        scanf("%d",&val);
        append(&head,val);

    }

    display(head);
}
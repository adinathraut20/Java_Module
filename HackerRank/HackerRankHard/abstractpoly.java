class LRUCache : public Cache{
    int count;
    public:
    
    LRUCache(int c){
        cp = c;
        count = 0;
        tail = head = NULL;
    }
    void set(int key, int value){
        if(1<=key && key<=20 && 1<=value && value<=2000){
        Node * node = new Node(key,value);
        
        if(head == NULL){
            head = node;
            tail = node;
        }
        else{
            
            //cout<<"cp "<<cp<<" count "<<count<<" tailkey "<<tail->key<<endl;
            if(cp <= count){
               
                mp.erase(tail->key);
                 node->next = head;
                head->prev = node;
                head = node;
                tail = tail->prev;
                tail->next = NULL;               
            }
            
            if(count<cp){
                node->next = head;
                head->prev = node;
                head = node; 
            }
               
        }
         
       mp.insert({key,node});
        if(cp>count)
        count++;
        }
      
    }
    int get(int k){
        if(mp.find(k) != mp.end()){
          
            Node* temp = head;
            //cout<<" temp->key "<<temp->key<<endl;
            if(temp->key == k){
                head = temp->next;
                temp = NULL;
            }
            else{
                temp = temp->next;
                while(1){
                    if(temp->key == k){
                        temp->prev->next = temp->next;
                        temp->next->prev = temp->prev;
                        temp = NULL;
                        break;
                    }
                    if(temp->next->next == NULL){
                        break;
                    }
                    temp = temp->next;
                }
                    temp=temp->next;
                    if(temp->key == k && temp->next == NULL){
                        tail = temp;
                        temp = NULL;
                }
            }
            mp.erase(k);
            int x = mp[k]->value;
             return x;  
        }
        return -1;
        
    }
    
}; 


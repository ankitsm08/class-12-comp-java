import os

os.chdir(os.path.dirname(os.path.abspath(__file__)))

# Paths to the folders
src_dir = 'Programs'
folders = {
  'Questions': 'md',
  'Algorithms': 'md',
  'VDTs': 'csv',
  'Outputs': 'folder'
}

# variable to run program without making the files and folders
dry_run = False

files = os.listdir(src_dir)

for dest, ext in folders.items():
  
  print(f'\n┌─ {dest} --> {ext}\n│')
  if not os.path.exists(dest) and not dry_run:
    os.makedirs(dest)

  
  for i, file in enumerate(files):
    base, _ = os.path.splitext(file)
    
    created = ""
    
    # If required to make a folder with the file_name
    # rather than add an extension
    if ext == 'folder':
      folder_path = os.path.join(dest, base)
      created = f'{base}/'  # folder_name
      
      if not dry_run:
        if not os.path.exists(folder_path):
          os.makedirs(folder_path)
        else:
          created += ' (exists)'
      
    else:
      new_file = f'{base}.{ext}'
      
      # Create the new file path in the folder with the new extension
      new_file_path = os.path.join(dest, new_file)
      
      created = new_file
      
      # Create the new file (write mode to create an empty file)
      if not dry_run:
        if not os.path.exists(new_file_path):
          open(new_file_path, 'w')
        else:
          created += ' (exists)'
    
    if i == len(files) - 1:
      print('└', end='')
    else:
      print('├', end='')
    print('────', created)


